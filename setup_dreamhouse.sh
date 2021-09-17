#!/bin/bash

sfdx force:org:list --clean

# Create Scratch Org Project
sfdx force:project:create -n STARWEST
cp project-scratch-def.json STARWEST/config/project-scratch-def.json
cp package.xml STARWEST/package.xml
cp .forceignore STARWEST/.forceignore

# Clone Dreamhouse App
echo "--- Clone Dreamhouse App Scratch Org project ---"
git clone https://github.com/dreamhouseapp/dreamhouse-lwc

# Create Scratch Org
echo "--- Create Scratch Org ---"
sfdx force:config:set defaultdevhubusername=DevHub2 --global
sfdx force:org:create -s -f dreamhouse-lwc/config/project-scratch-def.json -a STARWEST username=starwest21@provartesting.com
sfdx force:config:set defaultusername=dreamhouse --global

# Deploy Dreamhouse to Scratch Org
echo "--- Deploy Dreamhouse to Scratch Org ---"
cd dreamhouse-lwc
sfdx force:source:push -u STARWEST

# Deploy Admin Profile to Scratch Org
echo "--- Deploy Admin Profile to Scratch Org ---"
cd ../STARWEST
sfdx force:mdapi:retrieve -r package -u $1 -k package.xml
unzip ./package/unpackaged.zip
sfdx force:mdapi:convert --rootdir unpackaged --outputdir force-app
sfdx force:source:push -u STARWEST -f
cd ../dreamhouse-lwc

# Assign dreamhouse permission set to the default user
echo "--- Assign dreamhouse permission set to the default user ---"
sfdx force:user:permset:assign -n dreamhouse

# Import sample data into Scratch Org
echo "--- Import sample data into Scratch Org ---"
sfdx force:data:tree:import -p data/sample-data-plan.json 
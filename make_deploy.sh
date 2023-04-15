#!/usr/bin/bash

cp target/*.war CodeDeploy
cd CodeDeploy && zip ../demo-deploy.zip *.war appspec.yml scripts/*

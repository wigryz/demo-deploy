#!/usr/bin/env bash
cd /home/ubuntu/server || return 1
touch /home/ubuntu/server/log.txt
sudo java -jar -Dserver.port=80 *.war > /home/ubuntu/server/log.txt 2> /home/ubuntu/server/log.txt < /home/ubuntu/server/log.txt &
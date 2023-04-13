#!/bin/sh
ssh $SSH_USER@$SSH_HOST "
if [ ! -d $BACKUP_DIR ];
then
  mkdir $BACKUP_DIR
fi

cp $TEMP_DIR/$BUILD_APP_NAME.war $BACKUP_DIR/backup_$(date +"%Y%m%d_%H%M")
if (( $(ls -1 | wc -l) > $BACKUP_COUNT));
then
  rm $(ls -1 | head -1)
fi
"


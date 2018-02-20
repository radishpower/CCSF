#!/bin/bash

for f in *.java
do
  ONELINE=$(cat "$f" | grep class)
  echo $ONELINE | (?<=class)(.*)(?={)
done


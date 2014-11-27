#!/bin/bash

# Script to execute the mapper. See README.txt for information.

#!/bin/bash

function ensureSlash(){
  length=${1}-1

  # if the parameter passed to the function does not end with a slash, append one and return the result

  if [ "{$1:length}" != "/" ]; then
    echo ${1}/
  fi
}

JAR=md-mapper-${mapper_version}.jar

if [ "z${MLOGDIR}" != "z" ]; then

  # MLOGDIR environment variable is defined; make sure MLOGDIR ends with /
  MLOGDIR=$(ensureSlash $MLOGDIR)

  # let the log4j framework pick up the logging directory as a java property, refer to the log4j.properties file

  nice java -Dlogdir=$MLOGDIR -jar ${JAR} mapper_version=${mapper_version} $*
else
  # The MLOGDIR variable is not defined. Do not create a logdir property; the log file will be in the current directory

  nice java -jar ${JAR} mapper_version=${mapper_version} $*
fi
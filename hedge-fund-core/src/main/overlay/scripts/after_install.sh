#!/bin/bash -x

echo $*

printenv

yum -y --enablerepo=epel install supervisor

exit 0
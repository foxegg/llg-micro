#!/bin/sh
echo "Nacos auto config started"

authConfig=$(cat ../microservices-auth.yml)
commonConfig=$(cat ../microservices-common.yml)
gatewayConfig=$(cat ../microservices-gateway.yml)
mailConfig=$(cat ../microservices-mail.yml)
serviceConfig=$(cat ../module-system-service.yml)

# 组 ID
groupId="DEFAULT_GROUP"
tenant="ab140c36-ded9-491f-a178-37dfae795b5a"
type="yaml"

curl -X POST "192.168.3.3:8848/nacos/v1/cs/configs" -d "dataId=microservices-mail.yml&group=${groupId}&content=${mailConfig}&tenant=${tenant}&type=${type}"
printf "\n"
curl -X POST "192.168.3.3:8848/nacos/v1/cs/configs" -d "dataId=module-system-service.yml&group=${groupId}&content=${serviceConfig}&tenant=${tenant}&type=${type}"
printf "\n"
curl -X POST "192.168.3.3:8848/nacos/v1/cs/configs" -d "dataId=microservices-auth.yml&group=${groupId}&content=${authConfig}&tenant=${tenant}&type=${type}"
printf "\n"
curl -X POST "192.168.3.3:8848/nacos/v1/cs/configs" -d "dataId=microservices-common.yml&group=${groupId}&content=${commonConfig}&tenant=${tenant}&type=${type}"
printf "\n"
curl -X POST "192.168.3.3:8848/nacos/v1/cs/configs" -d "dataId=microservices-gateway.yml&group=${groupId}&content=${gatewayConfig}&tenant=${tenant}&type=${type}"
printf "\n"

echo "Nacos config pushed successfully finished"
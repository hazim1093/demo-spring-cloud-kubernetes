#!/usr/bin/env bash
set -e

mvn package
cp target/springcloudkubernetes-*.jar out/
docker build -f Dockerfile -t hazim/demo-springcloudkubernetes out/
docker push hazim/demo-springcloudkubernetes
kubectl --kubeconfig /c/config/config-devtest-apps187 apply -f src/kubernetes -n cp
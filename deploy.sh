
docker build -t hazim/springcloudkubernetes .
docker push hazim/springcloudkubernetes

kubectl apply -f src/kubernetes -n test
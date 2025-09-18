# Build and push fizz-service
docker build -t cesaratteh/fizz-service:latest ./fizz-service
docker push cesaratteh/fizz-service:latest

# Build and push buzz-service
docker build -t cesaratteh/buzz-service:latest ./buzz-service
docker push cesaratteh/buzz-service:latest

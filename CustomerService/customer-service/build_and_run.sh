#!/bin/bash

# Build the Docker image
docker build -t ifepill-customer-service:latest .

# Stop and remove any existing container with the same name
docker stop ifepill-customer-service || true
docker rm ifepill-customer-service || true

# Run the Docker container
docker run -d -p 8081:8081 --name ifepill-customer-service ifepill-customer-service:latest

echo "Container ifepill-customer-service is running and accessible on port 8081"
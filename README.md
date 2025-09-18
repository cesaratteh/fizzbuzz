# FizzBuzz Multi-Service App

This repository contains two simple Spring Boot services:

- **Fizz Service** (`/api/fizz`)
- **Buzz Service** (`/api/buzz`)

Both services can be run using Docker Compose locally or deployed to a Kubernetes cluster.

---

## Deployment Options

### 1. Docker Compose (Local Development)

```bash
docker-compose up -d
```

## 2. Kubernetes

```bash
./build-and-push-docker-image.sh
```

```bash
kubectl apply -f k8s-deployment.yaml
```

```bash
kubectl port-forward svc/fizz-service 8080:8080
```

```bash
kubectl port-forward svc/buzz-service 8081:8080
```

### k8s Cleanup

```bash
kubectl delete deployment fizz-deployment
```

```bash
kubectl delete deployment buzz-deployment
```

Access:

1. http://localhost:8080/api/fizz
2. http://localhost:8081/api/buzz

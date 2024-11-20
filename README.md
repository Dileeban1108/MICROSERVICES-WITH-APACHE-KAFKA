# MICROSERVICES WITH APACHE KAFKA

This project demonstrates a basic microservices architecture using **Apache Kafka** as a messaging broker. It includes a **Producer** and **Consumer** Spring Boot application, allowing communication between services via Kafka topics.

---

## Table of Contents

1. [Prerequisites](#prerequisites)
2. [Kafka Setup](#kafka-setup)
3. [Setting Up the Spring Boot Applications](#setting-up-the-spring-boot-applications)
4. [Running the Applications](#running-the-applications)
5. [Offset Explorer (Kafka Tool)](#offset-explorer-kafka-tool)
6. [Repository Structure](#repository-structure)

---

## Prerequisites

Before starting, ensure you have the following tools and software installed:

- **Java 11 or higher** (Required by Kafka, Offset Explorer, and Spring Boot)
- **Apache Kafka**
- **Zookeeper** (Kafka requires it for coordination)
- **Maven** (for building and running Spring Boot applications)
- **Offset Explorer** (for managing and monitoring Kafka topics)

---

## Kafka Setup

Follow the steps below to set up **Apache Kafka** and **Zookeeper** on your Ubuntu machine:

### 1. **Download Kafka**

1. Visit the [Apache Kafka Downloads page](https://kafka.apache.org/downloads).
2. Select a version (e.g., Kafka 3.9.0 with Scala 2.12).
3. Download the `.tgz` file using the link provided.

Example command to download directly:

```bash
wget https://downloads.apache.org/kafka/3.9.0/kafka_2.12-3.9.0.tgz

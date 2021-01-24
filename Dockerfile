FROM gradle:6.7.1-jdk11 AS builder

COPY --chown=gradle:gradle . /home/gradle/src

WORKDIR /home/gradle/src

RUN gradle build --no-daemon

EXPOSE 8080
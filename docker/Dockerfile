FROM gradle:6.8.1-jdk11

COPY --chown=gradle:gradle . /home/gradle/src

ENV REMOTE_RUN=true

WORKDIR /home/gradle/src
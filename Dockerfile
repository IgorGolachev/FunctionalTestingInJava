FROM gradle:6.8.1-jdk11

COPY --chown=gradle:gradle . /home/gradle/src

RUN ls -la

WORKDIR /home/gradle/src

RUN ls -la
FROM gradle:6.7.1-jdk11

COPY --chown=gradle:gradle . /home/gradle/src

RUN pwd
RUN ls -la

WORKDIR /home/gradle/src

RUN pwd
RUN ls -la

#RUN gradle test
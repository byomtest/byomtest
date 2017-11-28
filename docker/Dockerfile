FROM alpine:3.6

RUN apk add --no-cache openjdk8-jre

RUN mkdir -p /tmp /tmp/unzip /app

COPY helloworld*.zip /tmp/app.zip

RUN unzip /tmp/app.zip -d /tmp/unzip

RUN cp -rf /tmp/unzip/*/* /app

CMD ["/app/bin/helloworld"]

EXPOSE 4567

# 基于哪个镜像
FROM java:8
# 将本地文件夹挂载到当前容器
VOLUME /tmp
# 拷贝文件到容器，springcloud-test-0.0.1-SNAPSHOT.jar这里是maven打包后的名字
ADD springcloud-test-0.0.1-SNAPSHOT.jar springcloud-test-0.0.1-SNAPSHOT.jar
RUN bash -c 'touch /app.jar'
# 配置容器启动后执行的命令
ENTRYPOINT  ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/springcloud-test-0.0.1-SNAPSHOT.jar"]
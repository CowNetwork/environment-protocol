rm -rf src/main/java/network/cow/environment/protocol/v1

protoc --proto_path=proto --java_out=src/main/java .\proto\consumer_events.proto
protoc --proto_path=proto --java_out=src/main/java .\proto\consumer_requests.proto
protoc --proto_path=proto --java_out=src/main/java .\proto\service_events.proto
protoc --proto_path=proto --java_out=src/main/java .\proto\service_requests.proto

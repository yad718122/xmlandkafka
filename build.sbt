name := "demo02"

version := "0.1"

scalaVersion := "2.11.10"

libraryDependencies ++=Seq(
  "org.apache.spark" %% "spark-core" % "2.1.0",
  "org.apache.spark" %% "spark-sql" % "2.1.0",
  "org.apache.spark" %% "spark-streaming" % "2.1.0" % "provided",
  "org.apache.spark" %% "spark-streaming-kafka" % "1.6.1",
  "org.apache.spark" %% "spark-sql-kafka-0-10" % "2.1.0",
  "org.apache.kafka" %% "kafka" % "0.11.0.0",
  "org.apache.kafka" % "kafka-clients" % "0.11.0.0",
  "org.apache.kafka" % "kafka-streams" % "0.11.0.0",
  "org.apache.hbase" % "hbase" % "1.2.4" pomOnly(),
  "org.apache.hbase" % "hbase-common" % "1.2.4",
  "org.apache.hbase" % "hbase-server" % "1.2.4",
  "org.apache.hbase" % "hbase-client" % "1.2.4",
  "log4j" % "log4j" % "1.2.17",
  "org.apache.phoenix" % "phoenix-spark" % "4.12.0-HBase-1.2"

)
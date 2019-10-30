scalaVersion := "2.11.12"

val sparkVersion = "2.4.4"

libraryDependencies ++= Seq(
  "org.apache.spark" %% "spark-core" % sparkVersion,
  "org.apache.spark" %% "spark-graphx" % sparkVersion,
  "org.apache.spark" %% "spark-sql" % sparkVersion,
  "com.fasterxml.jackson.core" % "jackson-databind" % "2.10.0",
  "com.fasterxml.jackson.module" %% "jackson-module-scala" % "2.10.0"
  )

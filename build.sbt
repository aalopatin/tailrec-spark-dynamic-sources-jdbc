ThisBuild / version := "0.1.0-SNAPSHOT"

ThisBuild / scalaVersion := "2.13.8"

lazy val sparkVersion = "3.3.0"

lazy val root = (project in file("."))
  .settings(
    name := "tailrec-dynamic-sources",
    libraryDependencies ++= Seq(
      "com.typesafe" % "config" % "1.4.2"
      , "org.postgresql" % "postgresql" % "42.3.6"
      , "org.apache.spark" %% "spark-core" % sparkVersion
      , "org.apache.spark" %% "spark-sql" % sparkVersion
    )
  )

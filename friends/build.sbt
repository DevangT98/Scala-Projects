name := "friends"

version := "1.0"

organization := "edu.njit"

scalaVersion := "2.13.8"
// scalaVersion := "2.11.8"

libraryDependencies ++= Seq(
  "org.apache.spark" %% "spark-core" % "3.3.2" % "provided"
  //"org.apache.spark" %% "spark-core" % "2.4.4" % "provided"
)

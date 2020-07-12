ThisBuild / organization := "com.vub.ac.be"
ThisBuild / name := "Assignment-1"
ThisBuild / version := "0.1"
ThisBuild / scalaVersion := "2.13.1"

libraryDependencies ++= Seq(
  "com.typesafe.akka" %% "akka-actor" % "2.5.23",
  "com.typesafe.akka" %% "akka-stream" % "2.5.23",
  "edu.stanford.nlp" % "stanford-corenlp" % "3.5.2" artifacts (Artifact("stanford-corenlp", "models"), Artifact("stanford-corenlp")),
  "io.spray" %%  "spray-json" % "1.3.5"
)


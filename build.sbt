name := "scalamaths"

scalaVersion := "2.11.7"

libraryDependencies ++= Seq(
  "org.scala-lang.modules" %% "scala-parser-combinators" % "1.0.3",
  "org.specs2" % "specs2_2.11" % "2.3.11",
  "org.scalatest" % "scalatest_2.11" % "2.2.1" % "test",
  "junit" % "junit" % "4.7" % "test"
)

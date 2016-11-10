addSbtPlugin("com.github.gseitz" % "sbt-protobuf" % "0.5.3")
addSbtPlugin("com.github.gseitz" % "sbt-release" % "1.0.2")
addSbtPlugin("com.jsuereth" % "sbt-pgp" % "1.0.0")
addSbtPlugin("org.scoverage" % "sbt-scoverage" % "1.5.0")
addSbtPlugin("org.xerial.sbt" % "sbt-sonatype" % "1.1")

libraryDependencies ++= Seq(
  "com.github.os72" % "protoc-jar" % "3.1.0"
)

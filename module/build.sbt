name := """play-guard"""

organization := """com.digitaltangible"""

scalaVersion := "3.3.1"

credentials += Credentials("GitHub Package Registry", "maven.pkg.github.com", "klubraum", System.getenv("GITHUB_TOKEN"))

resolvers ++= Resolver.sonatypeOssRepos("snapshots")

lazy val root = (project in file(".")).enablePlugins(PlayScala)

scalacOptions ++= Seq("-feature", "-language:higherKinds")

libraryDependencies ++= Seq(
  "com.typesafe.play" %% "play-ws" % "2.9.0" % "test",
  ("org.scalatestplus.play" %% "scalatestplus-play" % "6.0.0-RC2" % "test")
    .excludeAll(ExclusionRule("com.typesafe.play")),
  "org.scalacheck" %% "scalacheck" % "1.17.0" % "test",
  "org.scalatest" %% "scalatest-mustmatchers" % "3.2.15" % "test",
  "org.scalatestplus" %% "scalacheck-1-17" % "3.2.15.0" % "test"
)

publishMavenStyle := true

publishArtifact in Test := false

githubOwner := "klubraum"

githubRepository := "play-guard"

PlayKeys.akkaHttpScala3Artifacts := true

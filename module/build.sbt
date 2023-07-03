name := """play-guard"""

organization := """com.digitaltangible"""

version := "2.6.0"

scalaVersion := "3.3.0"

credentials += Credentials("GitHub Package Registry", "maven.pkg.github.com", "klubraum", System.getenv("GITHUB_TOKEN"))

resolvers ++= Seq("Playframework".at("https://maven.pkg.github.com/klubraum/playframework"))

lazy val root = (project in file(".")).enablePlugins(PlayScala)

scalacOptions ++= Seq("-feature", "-language:higherKinds")

libraryDependencies ++= Seq(
  "org.scalatestplus.play" %% "scalatestplus-play" % "6.0.0-M6" % "test",
  "org.scalacheck" %% "scalacheck" % "1.17.0" % "test",
  "org.scalatest" %% "scalatest-mustmatchers" % "3.2.15" % "test",
  "org.scalatestplus" %% "scalacheck-1-17" % "3.2.15.0" % "test"
)

publishMavenStyle := true

publishArtifact in Test := false

githubOwner := "klubraum"

githubRepository := "play-guard"

pomExtra := <url>https://github.com/sief/play-guard</url>
  <licenses>
    <license>
      <name>Apache 2</name>
      <url>http://www.apache.org/licenses/LICENSE-2.0</url>
      <distribution>repo</distribution>
    </license>
  </licenses>
  <scm>
    <url>git@github.com:sief/play-guard.git</url>
    <connection>scm:git:git@github.com:sief/play-guard.git</connection>
  </scm>
  <developers>
    <developer>
      <id>sief</id>
      <name>Simon Effing</name>
      <url>https://www.linkedin.com/in/simoneffing</url>
    </developer>
  </developers>

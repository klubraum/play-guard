resolvers ++= Resolver.sonatypeOssRepos("snapshots")
addSbtPlugin("org.scalameta" % "sbt-scalafmt" % "2.5.0")
addSbtPlugin("com.codecommit" % "sbt-github-packages" % "0.5.3")
addSbtPlugin("com.typesafe.play" % "sbt-plugin" % "2.9.0")

addSbtPlugin("com.github.sbt" % "sbt-dynver" % "5.0.1")

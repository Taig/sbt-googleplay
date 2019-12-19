addSbtPlugin( "org.scala-android" % "sbt-android" % "1.6.8" )

githubProject := "sbt-googleplay"

libraryDependencies ++=
    "com.google.apis" % "google-api-services-androidpublisher" % "v3-rev20191113-1.30.3" ::
    "com.google.oauth-client" % "google-oauth-client-jetty" % "1.22.0" ::
    Nil

name := "Sbt-GooglePlay"

organization := "io.taig"

sbtPlugin := true

scalaVersion := "2.10.6"

version := "1.1.1"
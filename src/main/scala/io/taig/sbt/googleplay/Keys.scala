package io.taig.sbt.googleplay

import sbt._

trait Keys {
    val googlePlayApplication = taskKey[String] {
        "Application identifier"
    }

    val googlePlayServiceAccountEmail = taskKey[String] {
        "Email address of the Google Play Store API service account used for authentication"
    }

    val googlePlayServiceAccountKey = taskKey[File] {
        "Private key file (*.p12) of the Google Play Store API service account used for authentication"
    }

    val googlePlayTrack = settingKey[String] {
        "Target channel, either alpha, beta, production or rollout [beta]"
    }

    val googlePlayChangelog = taskKey[Map[String, String]] {
        "Changelog to be added to the listing"
    }

    val googlePlayPublish = taskKey[Unit] {
        "Package a release apk and publish it to Google Play"
    }

    val googlePlayPublishApk = taskKey[File ⇒ Unit] {
        "Publish an APK file to Google Play"
    }

    val googlePlayPublishFile = inputKey[Unit] {
        "Validate a user input file and publish it to Google Play"
    }
}
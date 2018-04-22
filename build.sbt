name := """vendingmachine"""
organization := "com.richardallison"

version := "1.0-SNAPSHOT"

lazy val root = (project in file(".")).enablePlugins(PlayJava, PlayEbean)

scalaVersion := "2.12.4"

libraryDependencies += guice
libraryDependencies += jdbc
libraryDependencies += "org.xerial" % "sqlite-jdbc" % "3.20.0"
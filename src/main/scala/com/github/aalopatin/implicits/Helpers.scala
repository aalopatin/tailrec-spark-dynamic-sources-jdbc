package com.github.aalopatin
package implicits

import com.typesafe.config.Config

import scala.jdk.CollectionConverters.SetHasAsScala

object Helpers {
  implicit class ConfigHelper(config: Config) {
    def getMap(path: String) =
      config.getConfig(path).entrySet().asScala
        .map(e => e.getKey -> e.getValue.unwrapped().toString).toMap
  }
}

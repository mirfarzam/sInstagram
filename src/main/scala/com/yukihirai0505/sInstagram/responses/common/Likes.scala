package com.yukihirai0505.sInstagram.responses.common

case class Likes(count: Int)

import play.api.libs.json.Json
object Likes {
  implicit val LikesFormat = Json.format[Likes]
}

package com.example.youtubeapi.models

data class  Playlist(
    //Items
    var kind: String?,
    var etag: String?,
    var items: List<Items>?,
    var pageInfo: PageInfo?,
    //Playlist
    var nextPageToken: String?,
    var prevPageToken: String?,
    var snippet: Snippet?,
    var contentDetails: ContentDetails?,
    var status: Status?
)

data class Thumbnails(
    var default: Default?,
    var medium: Medium?,
    var high: High?
)

data class Snippet(
    var publishedAt: String?,
    var channelId: String?,
    var title: String?,
    var description: String?,
    var thumbnails: Thumbnails?,
    var channelTitle: String?,
    var tags: List<String>?,
    var categoryId: String?,
    var liveBroadcastContent: String?,
    var localized: Localized?,
    var resourceId: ResourceId,
    //Playlist
    val defaultLanguage: String?,
)

data class PageInfo(
    var totalResults: Int?,
    var resultsPerPage: Int?
)

data class Medium(
    var url: String?,
    var width: Int?,
    var height: Int?
)

data class Localized(
    var title: String?,
    var description: String?
)

data class Items (
    var kind: String?,
    var etag: String?,
    var id: String?,
    var snippet: Snippet?,
    var contentDetails: ContentDetails?,
    //Playlist
    val status: Status?
)

data class ResourceId(
    val kind: String?,
    val videoId: String
)

data class Status(
    val privacyStatus: String?
)

data class High(
    var url: String?,
    var width: Int?,
    var height: Int?
)

data class Default(
    var url: String?,
    var width: Int?,
    var height: Int?
)

data class ContentRating(val name: String? = "")

data class ContentDetails(
    var duration: String?,
    var dimension: String?,
    var definition: String?,
    var caption: String?,
    var licensedContent: Boolean?,
    var contentRating: ContentRating?,
    var projection: String?,
    //Playlist
    val itemCount: Int?
)
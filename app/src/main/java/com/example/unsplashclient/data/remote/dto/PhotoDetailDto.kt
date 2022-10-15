package com.example.unsplashclient.data.remote.dto


import com.example.unsplashclient.domain.model.PhotoDetail
import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class PhotoDetailDto(
    @Json(name = "alt_description")
    val altDescription: String,
    @Json(name = "blur_hash")
    val blurHash: String,
    val color: String,
    @Json(name = "created_at")
    val createdAt: String,
    @Json(name = "current_user_collections")
    val currentUserCollections: List<Any>,
    val description: String,
    val downloads: Int,
    val exif: Exif,
    val height: Int,
    val id: String,
    @Json(name = "liked_by_user")
    val likedByUser: Boolean,
    val likes: Int,
    val links: LinksXX,
    val location: Location,
    val meta: Meta,
    @Json(name = "promoted_at")
    val promotedAt: Any,
    @Json(name = "public_domain")
    val publicDomain: Boolean,
    @Json(name = "related_collections")
    val relatedCollections: RelatedCollections,
    val sponsorship: Any,
    val tags: List<TagX>,
    @Json(name = "tags_preview")
    val tagsPreview: List<TagsPreview>,
    @Json(name = "topic_submissions")
    val topicSubmissions: TopicSubmissionsXXXX,
    val topics: List<Any>,
    @Json(name = "updated_at")
    val updatedAt: String,
    val urls: UrlsXXXXXX,
    val user: UserXXXXXX,
    val views: Int,
    val width: Int
)

fun PhotoDetailDto.toPhotoDetail(): PhotoDetail {
    return  PhotoDetail(
        description = description,
        likes = likes,
        imageUrl = urls.raw,
        photographer = user.username,
        camera = exif.name,
        location = "${location.name}, ${location.city}, ${location.country}",
        views = views,
        downloads = downloads,
    )
}
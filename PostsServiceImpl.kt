package com.exa.data.remote

import android.app.Application
import com.exa.data.dto.PostRequest
import com.exa.data.dto.PostResponse
import io.ktor.client.HttpClient
import io.ktor.client.request.*
import io.ktor.http.ContentType
import io.ktor.http.Url
import io.ktor.http.contentType
import java.lang.Exception

class PostsServiceImpl(
    private val client : HttpClient
) : PostsService {

    override suspend fun getPosts(): List<PostResponse> {
        return try {
            client.get{
                url(HttpRoutes.POST)
            }
        }catch (e:Exception) {
            println(e.message)
            emptyList()
        }
    }

    override suspend fun createPost(postRequest: PostRequest): PostResponse? {
        return try {
            client.post<PostResponse>(){
                url(HttpRoutes.POST)
                contentType(ContentType.Application.Json)
                body = postRequest
            }
        }catch (e:Exception) {
            println(e.message)
            null
        }
    }
}
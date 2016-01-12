package com.discobeard.dota2.api.wrapper

import com.discobeard.dota2.api.wrapper.requests.*

import javax.ws.rs.client.Client
import javax.ws.rs.client.ClientBuilder

class Dota2ApiClient {

    private static final DEFAULT_BASE_URL = 'https://api.steampowered.com'
    private static final DEFAULT_LANGUAGE = 'en_us'

    private String language
    private String baseUrl
    private String key

    Client client = ClientBuilder.newClient()

    public Dota2ApiClient(String key, String baseUrl = DEFAULT_BASE_URL, String language = DEFAULT_LANGUAGE) {
        this.key = key
        this.baseUrl = baseUrl
        this.language = language
    }

    public GetMatchHistoryRequest getMatchHistoryRequest() {
        new GetMatchHistoryRequest(client, baseUrl, key)
    }

    public GetHeroesRequest getHeroesRequest() {
        new GetHeroesRequest(client, baseUrl, key)
    }

    public GetMatchDetailsRequest getMatchDetailsRequest() {
        new GetMatchDetailsRequest(client, baseUrl, key)
    }

    public GetPlayerSummariesRequest getPlayerSummariesRequest() {
        new GetPlayerSummariesRequest(client, baseUrl, key)
    }

    public GetGameItemsRequest getGameItemsRequest(){
        new GetGameItemsRequest(client, baseUrl, key)
    }

    public GetRecentlyPlayedGamesRequest getRecentlyPlayedGames(){
        new GetRecentlyPlayedGamesRequest(client, baseUrl, key)
    }
}

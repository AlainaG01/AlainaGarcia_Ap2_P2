package edu.ucne.alainagarcia_ap2_p2.data.remote

import edu.ucne.alainagarcia_ap2_p2.data.remote.dto.RepositoryDto
import javax.inject.Inject

class RemoteDataSource @Inject constructor(
    private val gitHubApi: GitHubApi
) {
    suspend fun getRepository(username: String) = gitHubApi.listRepos(username)

    suspend fun getContributors(owner: String, repo: String) = gitHubApi.listContributors(owner, repo)

}
package kr.ac.kumoh.s20230176.w26w11thymeleaf.service

import kr.ac.kumoh.s20230176.w26w11thymeleaf.model.Song
import kr.ac.kumoh.s20230176.w26w11thymeleaf.repository.SongRepository
import org.springframework.stereotype.Service

@Service
class SongService(private val repository: SongRepository){
    fun findAll() = repository.findAll()
    fun findById(id: Int) = repository.findById(id)
    fun getRandomSong() = repository.findAll().randomOrNull()
}
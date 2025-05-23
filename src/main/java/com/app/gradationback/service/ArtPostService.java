package com.app.gradationback.service;

import com.app.gradationback.domain.ArtPostDTO;
import com.app.gradationback.domain.ArtPostVO;
import com.app.gradationback.domain.ArtVO;

import java.util.List;
import java.util.Optional;

public interface ArtPostService {

//    작품 게시글 등록
    public void register(ArtPostDTO artPostDTO);

//    작품 게시글 전체 조회
    public List<ArtPostDTO> getArtPostList();

//    작품 게시글 단일 조회
    public Optional<ArtPostDTO> getArtPostById(Long id);

//    작품 게시글 수정
    public void edit(ArtPostVO artPostVO);

//    작품 게시글 삭제
    public void removeById(Long id);

//    작품 게시글 전체 삭제 (회원 탈퇴)
//    public void removeAllByUserId(Long userId);

//    public void removeAllByArtId(Long artId);

}

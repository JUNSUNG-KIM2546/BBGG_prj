package kr.ac.kopo.file;

import java.util.List;

public interface FileDao {

	long insertFileList(List<FileVO> fileVOList);

	List<FileVO> selectFileList();
}

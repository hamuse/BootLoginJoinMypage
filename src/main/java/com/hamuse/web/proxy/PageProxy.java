/*
 * package com.hamuse.web.proxy;
 * 
 * import java.util.ArrayList; import java.util.Arrays; import
 * java.util.Collections; import java.util.HashSet; import java.util.List;
 * import java.util.Map; import java.util.Set; import
 * java.util.function.BiFunction; import java.util.function.Function; import
 * java.util.function.Supplier;
 * 
 * 
 * import org.springframework.beans.factory.annotation.Autowired; import
 * org.springframework.context.annotation.Lazy; import
 * org.springframework.stereotype.Component; import
 * org.springframework.transaction.annotation.Transactional;
 * 
 * import com.hamuse.web.util.Printer;
 * 
 * import lombok.Data;
 * 
 * @Component("page")
 * 
 * @Data
 * 
 * @Lazy public class PageProxy extends Proxy{ private int totalCount, startRow,
 * endRow, pageCount, pageNum, pageSize, startPage, endPage, blockCount,
 * blockNum, nextBlock, prevBlock; private boolean existPrev, existNext; private
 * String search; private final int BLOCK_SIZE = 5;
 * 
 * @Autowired Printer p;
 * 
 * @Autowired ArticleMapper articleMapper;
 * 
 * @Autowired Box map;
 * 
 * @SuppressWarnings("unused") public void paging() { ISupplier<String> s = ()
 * -> articleMapper.countArticle(); totalCount = Integer.parseInt(s.get());
 * System.out.println("프록시 안에서 찍은 전체글 갯수: " + totalCount); pageCount =
 * (totalCount % pageSize != 0) ? (totalCount / pageSize) + 1 : totalCount /
 * pageSize; startRow = (pageNum - 1) * pageSize; endRow = (pageNum ==
 * pageCount) ? totalCount - 1 : startRow + pageSize - 1; blockCount =
 * (pageCount % BLOCK_SIZE != 0) ? (pageCount / BLOCK_SIZE) + 1 : pageCount /
 * BLOCK_SIZE; blockNum = (pageNum - 1) / BLOCK_SIZE; startPage = blockNum *
 * BLOCK_SIZE + 1; endPage = ((blockNum + 1) != blockCount) ? startPage +
 * (BLOCK_SIZE - 1) : pageCount; existPrev = blockNum != 0; existNext =
 * (blockNum + 1) != blockCount; nextBlock = startPage + BLOCK_SIZE; prevBlock =
 * startPage - BLOCK_SIZE;
 * 
 * }
 * 
 * }
 */
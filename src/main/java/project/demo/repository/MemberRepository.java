package project.demo.repository;
import project.demo.domain.Member;
import java.util.List;
import java.util.Optional;


public interface MemberRepository {

    public String findMemberById(String id);
    public String  findMemberByNickName(String nickName);
    public boolean insertMember(Member member);
    public String findMaxIndex();
    public List<Object[]> findSaltAndPwById(String id);
    public String findPwBySalt(String salt);
    public String idSearchByNameAndPhone(String name, String phone);
    public String idSearchByNameAndEmail(String name, String email);
    public Optional<Member> findMemberByLoginId(String id);
    public List<Member> findAll();

}

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.wj.entity.MemberShip;
import com.wj.util.AvroSerializeUtil;
import com.wj.util.LoadJsonDataUtil;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author wangJun
 * @Description //TODO $end$
 * @Date $time$ $date$
 **/

public class AvroTest {

    @Test
    public void memberShip() {
        String path = "medadata/xsy_100-bigdata_membership.json";
        String jsonStr = LoadJsonDataUtil.loadJson(path);
        JSONObject json = JSONObject.parseObject(jsonStr);
        JSONArray array = json.getJSONArray("member_attributes");
        List<MemberShip> memberShipList = new ArrayList<>();
        for (int i = 0; i < array.size(); i++) {
            JSONObject jsonObject = array.getJSONObject(i);
            MemberShip memberShip = new MemberShip();
            memberShip.setName(jsonObject.getString("name"));
            memberShip.setDisplayName(jsonObject.getString("displayName"));
            memberShip.setDescription(jsonObject.getString("description"));
            memberShip.setDataType(jsonObject.getString("data_type"));
            memberShip.setDefault$(jsonObject.getString("default"));
            memberShip.setReadOnly(jsonObject.getBoolean("read_only"));
            memberShip.setNullable(jsonObject.getBoolean("nullable"));
            memberShip.setDerived(jsonObject.getBoolean("derived"));
            memberShip.setExpression(jsonObject.getString("expression"));
            memberShip.setSource(jsonObject.getString("source"));
            memberShip.setSourceColumn(jsonObject.getString("source_column"));
            memberShip.setApiLogic(jsonObject.getString("api_logic"));
            memberShipList.add(memberShip);
        }
        byte[] data = AvroSerializeUtil.serializeList(MemberShip.class, memberShipList, memberShipList.get(0).getSchema());
        System.out.println("avro序列化字节流成功!");
        List<MemberShip> memberShips = AvroSerializeUtil.deserializeList(MemberShip.class, data);
        System.out.println("avro反序列化字节流成功!");
        System.out.println(memberShips);
    }
}

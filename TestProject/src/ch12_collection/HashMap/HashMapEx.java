package ch12_collection.HashMap;

import java.util.HashMap;
import java.util.Map;

public class HashMapEx {

	public static void main(String[] args) {
		// Map 컬렉션 생성
		// Map<Key, Value>
		Map<String, Integer> map = new HashMap<String, Integer>();

		// Map의 key는 중복될 수 없음 : entry 구별하는 용도 key

		// Map collection에 객체 저장 : put(Key, Value)
		// key 값이 중독되었음 => key값이 컬렉션에 존재하는지 확인 후 있으면 value만 수정, 없으면 새로운 entry 추가
		map.put("김길동", 85);
		map.put("홍길동", 90);
		map.put("동장군", 80);
		map.put("홍길동", 95); // key가 중복되었기 때문에 앞에서 put한 홍길동:90 entry의 value가 수정됨

		// 전체 entry 수 : size()
		System.out.println("총 entry 수 : " + map.size());

	}

}

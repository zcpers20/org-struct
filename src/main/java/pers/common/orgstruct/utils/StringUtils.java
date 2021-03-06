package pers.common.orgstruct.utils;

import com.sun.jmx.snmp.SnmpStringFixed;

import java.util.Collection;
import java.util.Objects;
import java.util.stream.Collector;
import java.util.stream.Collectors;

/**
 * @Author Qingyu
 * @Date 2021/1/22 7:35 下午
 * @Version 1.0
 */
public class StringUtils {


	private static Collector<CharSequence, ?, String> joining(CharSequence separator) {
		return separator == null ? Collectors.joining() : Collectors.joining(separator);
	}

	/**
	 * 拼接集合数据，过滤空字段串&Null
	 * @param collection    集合
	 * @param separator     拼接符
	 * @return
	 */
	public static String join(Collection<?> collection, CharSequence separator) {
		if (collection == null){
			return null;
		}
		return collection.stream()
				.filter(Objects::nonNull)
				.map(String::valueOf)
				.filter(StringUtils::isNotEmpty)
				.collect(joining(separator));
	}

	public static boolean isEmpty(final CharSequence cs) {
		return cs == null || cs.length() == 0;
	}

	public static boolean isNotEmpty(final CharSequence cs) {
		return !isEmpty(cs);
	}

	public static String generateCode(int length){

		StringBuffer sbff = new StringBuffer();
		for (int i = 0; i < length; i++){
			sbff.append((int) (Math.random() * 10));
		}

		return sbff.toString();
	}

}

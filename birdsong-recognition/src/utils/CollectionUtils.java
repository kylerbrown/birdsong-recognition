/*
 * Copyright (C) 2016 Takuya KOUMURA
 * https://github.com/takuya-koumura/birdsong-recognition
 *
 * This file is part of Birdsong Recognition.
 * 
 * Birdsong Recognition is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 * 
 * Birdsong Recognition is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with Birdsong Recognition.  If not, see <http://www.gnu.org/licenses/>.
 */
package utils;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class CollectionUtils
{
	public static <T> Collector<? super T, ?, ArrayList<T>> arrayListCollector()
	{
		return Collectors.toCollection(ArrayList::new);
	}
	
	public static ArrayList<int[]> deepCopy(ArrayList<int[]> list)
	{
		return list.stream().map(s->Arrays.copyOf(s, s.length)).collect(arrayListCollector());
	}
	
	public static <T> T last(ArrayList<T> list)
	{
		return list.get(list.size()-1);
	}
}

package java8.intro.lambdaExpression;

import java.util.List;

import java8.intro.defaultMethodInterface.Faction;

public interface Sorting<T> {

	public void sortingLambdaExp(List<Faction> lst);

	public void sorting(List<T> lst);
	
	public void sortingLambdaExp_2(List<Faction> lst);
}

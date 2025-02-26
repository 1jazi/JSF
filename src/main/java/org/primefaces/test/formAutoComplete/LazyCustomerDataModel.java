package org.primefaces.test.formAutoComplete;

import org.primefaces.model.LazyDataModel;

public class LazyCustomerDataModel  {

//    private static final long serialVersionUID = 1L;
//
//    private List<Customer> datasource;
//
//    public LazyCustomerDataModel(List<Customer> datasource) {
//        this.datasource = datasource;
//    }
//
//    @Override
//    public Customer getRowData(String rowKey) {
//        for (Customer customer : datasource) {
//            if (customer.getId() == Integer.parseInt(rowKey)) {
//                return customer;
//            }
//        }
//
//        return null;
//    }
//
//    @Override
//    public String getRowKey(Customer customer) {
//        return String.valueOf(customer.getId());
//    }
//
//    @Override
//    public int count(Map<String, FilterMeta> filterBy) {
//        return (int) datasource.stream()
//                .filter(o -> filter(FacesContext.getCurrentInstance(), filterBy.values(), o))
//                .count();
//    }
//
//    @Override
//    public List<Customer> load(int offset, int pageSize, Map<String, SortMeta> sortBy, Map<String, FilterMeta> filterBy) {
//        // apply offset & filters
//        List<Customer> customers = datasource.stream()
//                .filter(o -> filter(FacesContext.getCurrentInstance(), filterBy.values(), o))
//                .collect(Collectors.toList());
//
//        // sort
//        if (!sortBy.isEmpty()) {
//            List<Comparator<Customer>> comparators = sortBy.values().stream()
//                    .map(o -> new LazySorter(o.getField(), o.getOrder()))
//                    .collect(Collectors.toList());
//            Comparator<Customer> cp = ComparatorUtils.chainedComparator(comparators); // from apache
//            customers.sort(cp);
//        }
//
//        return customers.subList(offset, Math.min(offset + pageSize, customers.size()));
//    }
//
//    private boolean filter(FacesContext context, Collection<FilterMeta> filterBy, Object o) {
//        boolean matching = true;
//
//        for (FilterMeta filter : filterBy) {
//            FilterConstraint constraint = filter.getConstraint();
//            Object filterValue = filter.getFilterValue();
//
//            try {
//                Object columnValue = String.valueOf(ShowcaseUtil.getPropertyValueViaReflection(o, filter.getField()));
//                matching = constraint.isMatching(context, columnValue, filterValue, LocaleUtils.getCurrentLocale());
//            }
//            catch (ReflectiveOperationException | IntrospectionException e) {
//                matching = false;
//            }
//
//            if (!matching) {
//                break;
//            }
//        }
//
//        return matching;
//    }

}

package com.offcn.group;
import java.io.Serializable;
import java.util.List;
import com.offcn.pojo.TbSpecification;
import com.offcn.pojo.TbSpecificationOption;
/**
 * 规格组合实体类
 * @author Administrator
 *
 */
public class Specification implements Serializable {
    private TbSpecification specification;
    private List<TbSpecificationOption> specificationOptionList;

    public TbSpecification getSpecification() {
        return specification;
    }
    public void setSpecification(TbSpecification specification) {
        this.specification = specification;
    }
    public List<TbSpecificationOption> getSpecificationOptionList() {
        return specificationOptionList;
    }
    public void setSpecificationOptionList(List<TbSpecificationOption> specificationOptionList) {
        this.specificationOptionList = specificationOptionList;
    }

    @Override
    public String toString() {
        return "Specification{" +
                "specification=" + specification +
                ", specificationOptionList=" + specificationOptionList +
                '}';
    }
}
package keon_test.demo.communication.model;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;


/**
 * QCommunication is a Querydsl query type for Communication
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QCommunication extends EntityPathBase<Communication> {

    private static final long serialVersionUID = 1739319460L;

    public static final QCommunication communication = new QCommunication("communication");

    public final keon_test.demo.common.model.QBaseEntity _super = new keon_test.demo.common.model.QBaseEntity(this);

    //inherited
    public final EnumPath<keon_test.demo.common.model.ActiveType> active = _super.active;

    public final StringPath contents = createString("contents");

    //inherited
    public final NumberPath<Long> createdAt = _super.createdAt;

    //inherited
    public final NumberPath<Long> createdId = _super.createdId;

    //inherited
    public final NumberPath<Long> id = _super.id;

    public final StringPath subTitle = createString("subTitle");

    public final StringPath title = createString("title");

    //inherited
    public final NumberPath<Long> updatedAt = _super.updatedAt;

    //inherited
    public final NumberPath<Long> updatedId = _super.updatedId;

    public QCommunication(String variable) {
        super(Communication.class, forVariable(variable));
    }

    public QCommunication(Path<? extends Communication> path) {
        super(path.getType(), path.getMetadata());
    }

    public QCommunication(PathMetadata metadata) {
        super(Communication.class, metadata);
    }

}

